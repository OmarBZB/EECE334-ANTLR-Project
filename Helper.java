
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


class Tuple{
	List<Object> Tup=new ArrayList<Object>();
	
	public Tuple(List<Object> tup) {
		Tup=tup;
	}
}
class expression{
	Tuple T;
	String S;
	Integer I;
	
	public expression() {}

	public expression(Tuple tup) {
		T=tup;
	}
	
	public expression(Integer Int) {
		I=Int;
	}
	
	public expression(String str) {
		S=str;
	}
	public expression(Object obj) {
		if(obj.getClass() == Integer.class) {
			I=(Integer)obj;
		}
		if(obj.getClass() == String.class) {
			S=(String)obj;
		}
		if(obj.getClass() == Tuple.class) {
			T=(Tuple)obj;
		}	
	}
	
	@Override
	public String toString() {
		if(S != null) {
			if(S=="ClosingParentheses") {
				return "";
			}
			return S.substring(1, S.length()-1);
		}
		else if(I != null) {
			return I.toString();
		}
		else if(T != null) {
			String str="(";
			str+=T.Tup.get(0).toString();
			for(int i=1;i<T.Tup.size();i++) {
				expression e=(expression)T.Tup.get(i);
				str+=", "+e.toString();
			}
			str+=")";
			return str;
		}
		return "()";
	}

	
	
}
public class Helper {
	
	public HashMap<String,Object> vars=new HashMap<String,Object>();
	
	public void variabledeclare(String str, expression val) {
		vars.put(str,val);
	}
	
	public expression add(String str, expression v2) {
		expression v=(expression)vars.get(str);
		if(v.S == "ClosingParentheses") {
			return v2;
		}
		if(v2.S == "ClosingParentheses") {
			return v;
		}
		if(v.T != null && v2.T != null) {
			expression e=new expression();
			List<Object> Tup1 = v.T.Tup;
			List<Object> Tup2 = v2.T.Tup;
			Tup1.addAll(Tup2);
			Tuple T1= new Tuple(Tup1);
			e.T=T1;
			return e;
		}
		
		else if(v.S != null && v2.S != null) {
			String S1=v.S.substring(0, v.S.length()-1)+v2.S.substring(1, v2.S.length());
			expression e=new expression();
			e.S=S1;
			return e;
		}
		
		else if(v.I != null && v2.I != null) {
			Integer I1=v.I+v2.I;
			expression e=new expression();
			e.I=I1;
			return e;
		}
		else {
			System.out.println("can't add variables of different types");
		}
		
		return null;
	}

	public expression ToTuple(expression v) {
		expression e=new expression();
		if(v.T != null) {
			e.T=v.T;
		}
		else if(v.S != null) {
			List<Object> array=new ArrayList<Object>();
			array.add(v);
			Tuple tup =new Tuple(array);
			e.T=tup;
		}
		else if(v.I != null) {
			List<Object> array=new ArrayList<Object>();
			array.add(v);
			Tuple tup =new Tuple(array);
			e.T=tup;
		}
		return e;
	}

	public String PrintFormat(String str) {
		if(vars.containsKey(str)) {
			expression e = (expression)vars.get(str);
			if(e.S=="ClosingParentheses") {
				return "()";
			}
			return vars.get(str).toString();
		}
		return null;
	}
	
	public String PrintString(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public expression slice(String name, int num) {
		expression id=(expression)vars.get(name);
		expression e=new expression();
		List<Object> array = id.T.Tup;
		int n=num;
		if(num<0) {
			n=array.size()+num;
		}
		e=(expression)array.get(n);
		return e;
	}

	public expression slice(String name, int i, int j) {
		int n=i;
		int m=j;
		expression id=(expression)vars.get(name);
		List<Object> arr = id.T.Tup;
		if(i<0) {
			n=arr.size()+i+1;
		}
		if(j<0) {
			m=arr.size()+j+1;
		}
		List<Object> array =id.T.Tup.subList(n, m);
		expression e=new expression();
		Tuple tup = new Tuple(array);
		e.T=tup;
		return e;
	}

	public expression merge(expression v, expression v2) {
		if(v2.S=="ClosingParentheses") {
			if(v.T != null) {
				List<Object> array= new ArrayList<Object>();
				array.add(v);
				Tuple tup=new Tuple(array);
				return new expression(tup);
			}
			return ToTuple(v);
		}
		else {
		v2.T.Tup.add(0, v);
		return v2;
		}
	}
	
	public expression getVal(String str) {
		return (expression)vars.get(str);
	}

	public List<String> addids(String str) {
		List<String> list=new ArrayList<String>();
		list.add(str);
		return list;
	}

	public List<String> addids(String str, List<String> ids) {
		List<String> list=new ArrayList<String>();
		list.add(str);
		list.addAll(ids);
		return list;
	}

	public void unpacking(List<String> d, String name) {
		expression val= (expression)vars.get(name);
		for(int i=0; i<d.size(); i++) {
			vars.put(d.get(i),val.T.Tup.get(i));
		}
	}
	
	public int negative(int i) {
		return -i;
	}

	public expression addint(expression int1, expression int2) {
		expression e=new expression();
		e.I=int1.I+int2.I;
		return e;
	}

	public String addstring(String str, String a) {
		String S1=str.substring(0, str.length()-1)+a.substring(1, a.length());
		return S1;
	}

	public expression addtuple(expression t1, expression a) {
		if(t1.S == "ClosingParentheses") {
			return a;
		}
		if(a.S == "ClosingParentheses") {
			return t1;
		}
		expression e=new expression();
		List<Object> Tup1 = t1.T.Tup;
		List<Object> Tup2 = a.T.Tup;
		Tup1.addAll(Tup2);
		Tuple T1= new Tuple(Tup1);
		e.T=T1;
		return e;
	}

	public String PrintSlice(expression sl) {
		String s1=sl.toString();
		return s1;
	}
	
	public String Printexpression(expression e) {
		String s1=e.toString();
		return s1;
	}
	
}
























