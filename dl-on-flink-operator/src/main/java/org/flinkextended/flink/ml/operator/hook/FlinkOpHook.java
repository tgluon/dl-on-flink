/*
 * Copyright 2022 Deep Learning on Flink Authors
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
 */

package org.flinkextended.flink.ml.operator.hook;

/** flink operator open close function hook,execute user logic on flink open and close function. */
public interface FlinkOpHook {
    /**
     * execute user logic on flink open function.
     *
     * @throws Exception
     */
    default void open() throws Exception {}

    /**
     * execute user logic on flink close function.
     *
     * @throws Exception
     */
    default void close() throws Exception {}
}
