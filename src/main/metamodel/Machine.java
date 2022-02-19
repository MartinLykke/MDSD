package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Machine {
	public List<State> states = new ArrayList<State>();
	public State initialState;
	public State state;
	public Map<String, Integer> integers = new HashMap<>();
	public State currentState;
	
	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		for (State state: states) {
			if (state.getName() == string) {
				return state;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		return this.integers.containsKey(string);
	}
	
	public Integer getInteger(String string) {
		 if(hasInteger(string)) {
			 return integers.get(string);
		 }
		return 0;
		}

}
