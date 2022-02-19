package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String name;
	private List<Transition> transitions;
	public State(String name) {
		super();
		this.name = name;
		this.transitions = new ArrayList<>();
	}
	public void addTransition(Transition trans) {
		this.transitions.add(trans);
	}
	public String getName() {
		return name;
	}
	public List<Transition> getTransitions() {
		return transitions;
	}
	public Transition getTransitionByEvent(String string) {
		for (Transition transition: transitions) {
			if (transition.getEvent().equals(string)) {
				return transition;
			}
		}
		return null;
	}
}