/*
 * Created on Aug 02, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.assertj.core.api;

import static org.mockito.Mockito.mock;

import org.assertj.core.internal.Integers;


/**
 * Base class for {@link IntegerAssert} tests.
 * 
 * @author Olivier Michallat
 */
public abstract class IntegerAssertBaseTest extends BaseTestTemplate<IntegerAssert, Integer> {
  protected Integers integers;

  @Override
  protected IntegerAssert create_assertions() {
    return new IntegerAssert(0);
  }

  @Override
  protected void inject_internal_objects() {
    super.inject_internal_objects();
    integers = mock(Integers.class);
    assertions.integers = integers;
  }

  protected Integers getIntegers(IntegerAssert someAssertions) {
    return someAssertions.integers;
  }
}
