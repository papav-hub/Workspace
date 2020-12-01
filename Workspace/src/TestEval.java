import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class TestEval {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String fomula = "10 + 20";
		System.out.println(engine.eval(fomula));
		System.out.println(engine.eval(fomula).getClass().getName());

	}

}
