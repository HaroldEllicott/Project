package com.fdm.entities;

public interface Persistable <T extends Persistable> {
	int getId();
	void update(T persistable);

}
