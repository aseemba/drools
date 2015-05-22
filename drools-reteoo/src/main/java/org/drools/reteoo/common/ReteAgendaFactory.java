/*
 * Copyright 2010 JBoss Inc
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

package org.drools.reteoo.common;


import org.drools.core.common.AgendaFactory;
import org.drools.core.common.InternalAgenda;
import org.drools.core.impl.InternalKnowledgeBase;

import java.io.Serializable;

public class ReteAgendaFactory implements AgendaFactory, Serializable {

    public InternalAgenda createAgenda(InternalKnowledgeBase kBase, boolean initMain) {
        return new ReteAgenda( kBase, initMain );
    }

    public InternalAgenda createAgenda(InternalKnowledgeBase kBase) {
        return new ReteAgenda( kBase );
    }

}
