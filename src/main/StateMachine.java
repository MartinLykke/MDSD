package main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	public StateMachine() {

	}
	private Map<String,State> states = new HashMap<>();
	private Map<String, Integer> integers = new HashMap<>();
	private State current;
	private State initial;
	private State newState;
	private String currentEvent;
	public State currentState;
	public Transition currentTrans;

	
	public Machine machine = new Machine();

	private State getState(String name) {
		if(!states.containsKey(name)) states.put(name, new State(name));
		return states.get(name);
	}
	
	public Machine build() {
		if (machine.initialState == null){
			machine.initialState = machine.states.get(0);
		}
		machine.currentState = machine.initialState;
		return machine;
	}

	public StateMachine state(String string) {
		// TODO Auto-generated method stub
		current = new State(string);
		machine.states.add(currentState);
		return this;
	}

	public StateMachine initial() {
		initial = getState(current.getName());
		return this;
	}
	
	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		currentTrans = new Transition();		
		return this;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		currentTrans.target = new State(string);		
		return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		integers.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentTrans.hasSetOp = true;
		currentTrans.setIntOpValue = i;
		currentTrans.opVariableName = string;
		integers.put(string, i);
		return this;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		currentTrans.hasIncrementOp = true;
		currentTrans.opVariableName = string;
		return this;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		currentTrans.hasDecrementOp = true;
		currentTrans.opVariableName = string;
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTrans.opVariableName = string;
		currentTrans.equals(string);
		
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
