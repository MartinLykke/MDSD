package main;

import java.util.HashMap;
import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
	
	private Machine machine;
	private State currentState;
	
	public MachineInterpreter() {
		currentState = machine.getInitialState();
		HashMap<String, Integer> integers = new HashMap<String, Integer>();
	}

	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.machine = m;
		currentState = m.getInitialState();
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return null;
	}

	public void processEvent(String event) {
		for(Transition t: currentState.getTransitions()) {
			if(t.getEvent().equals(event)) {
				t.effect();
				currentState = t.getTarget();
				return;
			}
		}
		System.err.println("Unhandled event "+event);
	}

	public int getInteger(String string) {
		return machine.getInteger(string);
	}

}
