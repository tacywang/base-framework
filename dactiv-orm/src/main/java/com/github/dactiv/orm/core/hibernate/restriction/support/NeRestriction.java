/*
 * Copyright 2013-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dactiv.orm.core.hibernate.restriction.support;

import com.github.dactiv.orm.core.RestrictionNames;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 * 不等于约束 ( from object o where o.value <> ?) RestrictionName:NE
 * <p>
 * 表达式:NE属性类型_属性名称[_OR_属性名称...]
 * </p>
 * 
 * @author maurice
 *
 */
public class NeRestriction extends EqRestriction{

	/*
	 * (non-Javadoc)
	 * @see com.github.dactiv.orm.core.hibernate.restriction.support.EqRestriction#getRestrictionName()
	 */
	public String getRestrictionName() {
		
		return RestrictionNames.NE;
	}

	/*
	 * (non-Javadoc)
	 * @see com.github.dactiv.orm.core.hibernate.restriction.support.EqRestriction#build(java.lang.String, java.lang.Object)
	 */
	public Criterion build(String propertyName, Object value) {
		
		return value == null ? Restrictions.isNotNull(propertyName) : Restrictions.ne(propertyName, value);
		
	}

	
}
