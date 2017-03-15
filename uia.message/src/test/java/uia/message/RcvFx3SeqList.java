/*******************************************************************************
 * Copyright 2017 UIA
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package uia.message;

import java.util.Map;

import uia.message.fx.ValueFx;

public class RcvFx3SeqList implements ValueFx {

    @Override
    public int encode(String blockName, Object value, Map<String, Object> parsed) {
        // 2*count-1
        return 2 * (Integer) parsed.get("count") - 1;
    }

    @Override
    public int decode(String blockName, byte[] data, Map<String, Object> parsed, int bytePt, int bitPt) {
        // 2*count-1
        return 2 * (Integer) parsed.get("count") - 1;
    }

}
