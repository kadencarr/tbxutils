/*
 * $Id$
 *-----------------------------------------------------------------------------
 * Copyright 2000 Lance Finn Helsten (helsten@acm.org)
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
package org.ttt.salt.editor.tbxedit;

import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import org.w3c.dom.Element;
import org.flyingtitans.xml.TreeView;

/**
 * @author Lance Finn Helsten
 * @version $Id$
 */
public class Element_map extends XMLElement
{
    /*
     */

    /** SCM information. */
    public static final String RCSID = "$Id$";
        
    /**
     * @param elem The DOM element that has the data.
     * @param window The view this element displays in.
     * @param title The title to use in the view.
     */
    public Element_map(Element elem, TreeView window, String title)
    {
        super(elem, window, title, false);
        addAttributeTextField(BUNDLE, "unicode");
        addAttributeTextField(BUNDLE, "code");
        addAttributeTextField(BUNDLE, "ent");
        addAttributeTextField(BUNDLE, "subst");
    }
    
    /**
     * Validator and save method for attribute unicode.
     *
     * @param evt {@link java.awt.event.ActionEvent} that generates this event.
     */
    public void validateAndSaveAttribute_unicode(ActionEvent evt)
    {
        JTextField text = (JTextField) attributes.get("unicode");
        String value = text.getText();
        elem.setAttribute("unicode", value);
    }
    
    /**
     * Validator and save method for attribute code.
     *
     * @param evt {@link java.awt.event.ActionEvent} that generates this event.
     */
    public void validateAndSaveAttribute_code(ActionEvent evt)
    {
        JTextField text = (JTextField) attributes.get("code");
        String value = text.getText();
        elem.setAttribute("code", value);
    }
    
    /**
     * Validator and save method for attribute ent.
     *
     * @param evt {@link java.awt.event.ActionEvent} that generates this event.
     */
    public void validateAndSaveAttribute_ent(ActionEvent evt)
    {
        JTextField text = (JTextField) attributes.get("ent");
        String value = text.getText();
        elem.setAttribute("ent", value);
    }
    
    /**
     * Validator and save method for attribute subst.
     *
     * @param evt {@link java.awt.event.ActionEvent} that generates this event.
     */
    public void validateAndSaveAttribute_subst(ActionEvent evt)
    {
        JTextField text = (JTextField) attributes.get("subst");
        String value = text.getText();
        elem.setAttribute("subst", value);
    }
}