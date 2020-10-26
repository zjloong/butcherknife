/*
 * Copyright (C) 2020 LitterSun.
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

package com.littersun.butcherknife.plugin.inject.visitor;


import com.littersun.butcherknife.plugin.Context;

import org.objectweb.asm.ClassVisitor;

public class ContextClassVisitor extends ClassVisitor {
    private final Context mContext;

    public ContextClassVisitor(Context context) {
        super(context.getASMVersion());
        mContext = context;
    }

    public void visit(int version, int access, String name, String sig, String superName, String[] interfaces) {
        mContext.setClassName(name);
        super.visit(version, access, name, sig, superName, interfaces);
    }
}
