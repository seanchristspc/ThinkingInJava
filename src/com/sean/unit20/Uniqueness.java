package com.sean.unit20;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique=true);
}
