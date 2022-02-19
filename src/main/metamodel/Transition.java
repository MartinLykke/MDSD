package main.metamodel;

public class Transition {
	boolean condition;
	public String event;
	public Runnable effect;
	public State target;
	public boolean hasIncrementOp;
	public boolean hasDecrementOp;
	public boolean hasSetOp;
	public String conditionalVariableName;
	public int setIntOpValue;
	public String opVariableName;
	public Integer conditionComparedValue;
	public boolean conditionGT;
	boolean conditionLT;
	boolean conditionEqual;
	boolean hasOperation;
	Integer conditionalCompareValue;
	
	
	public Transition() {
	}
	
	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return hasSetOp;
	}

	public boolean hasIncrementOperation() {
		return hasIncrementOp;
	}

	public boolean hasDecrementOperation() {
		return hasDecrementOp;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		return opVariableName;
	}

	public boolean isConditional() {
		return condition;

	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return conditionalVariableName;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return conditionalCompareValue;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return conditionEqual;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return conditionGT;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return conditionLT;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return hasIncrementOp || hasDecrementOp;
	}
	public String getEvent() {
		return event;
	}

	public void effect() {
		this.effect.run();
	}

}
