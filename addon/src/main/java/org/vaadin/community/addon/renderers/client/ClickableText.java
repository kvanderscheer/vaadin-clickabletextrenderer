/*
 * Copyright 2016 Vaadin Community.
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
package org.vaadin.community.addon.renderers.client;

import java.io.Serializable;

/**
 * Presentation value for use with 
 * {@link org.vaadin.community.addon.renderers.ClickableTextRendererAdv ClickableTextRendererAdv}.
 */
public class ClickableText implements Serializable {

    private static final long serialVersionUID = 44635476862L;

    /**
     * The values that will be rendered. This can be either plain text
     * (when {@link #isHTML} is {@code false}) or HTML 
     * (when {@link #isHTML} is {@code true}).
     */
    public String value = null;
    
    /**
     * Defines if the value should be interpreted as plain text
     * or HTML. Default is {@code false}.
     * 
     * <p>Note that the application will become suspectible to cross-side
     * scripting attacks when this value is {@code true}. It is the responsibility
     * of the application to check that {@code value} isn't some harmful HTML.
     */
    public boolean isHTML = false;
    
    /**
     * Description for the link. This will become an HTML tooltip.
     * Set to {@code null} to disable.
     */
    public String description = null;
    
}
