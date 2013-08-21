package com.robert;

import java.util.HashMap;
import java.util.Map;

class Prototype {
	
}

public class PrototypeManager {
	
	private static PrototypeManager pm;
	
	private Map prototypes = null;
	
	private PrototypeManager() {
		prototypes = new HashMap();
	}
	
	public static PrototypeManager getManager () {
		if (pm == null) {
			pm = new PrototypeManager();
		}
		return pm;
	}

	public void register(String name, Object prototype) {
		prototypes.put(name, prototype);
	}
	
	public void unregister(String name) {
		prototypes.remove(name);
	}
	
	public Prototype getPrototype(String name) {
		if(prototypes.containsKey(name)) {
			return (Prototype)prototypes.get(name);
		} else {
			Prototype object = null;
			try {
				object = (Prototype) Class.forName(name).newInstance();
				register(name, object);
			} catch (Exception e) {
				System.err.println("Class " + name + "not define");
			}
			return object;
		}
	}
}
