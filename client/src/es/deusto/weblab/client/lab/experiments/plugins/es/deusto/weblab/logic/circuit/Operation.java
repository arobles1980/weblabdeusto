/*
* Copyright (C) 2005-2009 University of Deusto
* All rights reserved.
*
* This software is licensed as described in the file COPYING, which
* you should have received as part of this distribution.
*
* This software consists of contributions made by many individuals, 
* listed below:
*
* Author: Pablo Orduña <pablo@ordunya.com>
*
*/

package es.deusto.weblab.client.lab.experiments.plugins.es.deusto.weblab.logic.circuit;

public class Operation {
    
    private final String name;
    
    private Operation(String name){
	this.name = name;
    }
    
    public final static Operation AND  = new Operation("and");
    public final static Operation NAND = new Operation("nand");
    public final static Operation OR   = new Operation("or");
    public final static Operation NOR  = new Operation("nor");
    public final static Operation XOR  = new Operation("xor");
    
    private final static Operation [] OPERATIONS = {
	AND, NAND, OR, NOR, XOR    
    };
    
    public static Operation get(String name){
	for(Operation op : OPERATIONS)
	    if(op.getName().equals(name.toLowerCase()))
		return op;
	throw new IllegalArgumentException("Operation " + name + " not found");
    }
    
    public static Operation [] getOperations(){
    	return OPERATIONS;
    }
    
    public String getName(){
	return this.name;
    }
}