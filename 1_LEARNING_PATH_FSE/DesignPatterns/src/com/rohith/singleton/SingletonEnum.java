package com.rohith.adapter.singleton;

/*
 * Another simple way of creating singleton class and its by enum. Enum constants are static and final so that we cant change the values once created.
 */
public class SingletonEnum {
	public enum SingleEnum {
		SINGLETON_ENUM;
	}
}

/*
 * Here enum gets loaded statistically, so its thread safe. The clone method is final and it ensures enum constants never get cloned.
 * Enum is inherently serializable, so the serilaization mechanism ensures duplicate instances are never created.
 */
