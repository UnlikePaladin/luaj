package org.luaj.vm;


public class LocVars {
	public LString varname;
	public int startpc;
	public int endpc;
	
	public LocVars(LString varname, int startpc, int endpc) {
		this.varname = varname;
		this.startpc = startpc;
		this.endpc = endpc;
	}

}