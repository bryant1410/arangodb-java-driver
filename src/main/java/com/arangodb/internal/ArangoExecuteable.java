/*
 * DISCLAIMER
 *
 * Copyright 2016 ArangoDB GmbH, Cologne, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.internal;

import com.arangodb.internal.velocystream.Connection;
import com.arangodb.util.ArangoUtil;

/**
 * @author Mark - mark at arangodb.com
 *
 */
public abstract class ArangoExecuteable<E extends ArangoExecutor<R, C>, R, C extends Connection> {

	protected final E executor;

	public ArangoExecuteable(final E executor) {
		super();
		this.executor = executor;
	}

	protected E executor() {
		return executor;
	}

	public ArangoUtil util() {
		return executor.util();
	}
}
