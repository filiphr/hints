
/*
 * Copyright Gunnar Morling
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package io.cloudnativejava.lucene;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import io.cloudnativejava.HintsUtils;
import org.apache.lucene.util.AttributeImpl;

import java.lang.invoke.MethodHandle;
import java.util.function.BooleanSupplier;

/**
 * An AttributeFactory creates instances of {@link AttributeImpl}s.
 *
 * @author Gunnar Morling
 * @author Josh Long
 */

@TargetClass(onlyWith = LuceneBooleanSupplier.class, className = "org.apache.lucene.util.AttributeFactory")
public final class AttributeFactorySubstitution {

	public AttributeFactorySubstitution() {
	}

	@Substitute
	static final MethodHandle findAttributeImplCtor(Class<? extends AttributeImpl> clazz) {
		return null;
	}

}
