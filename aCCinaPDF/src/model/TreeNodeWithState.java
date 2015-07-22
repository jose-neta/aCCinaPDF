/*
 *   Copyright 2015 Luís Diogo Zambujo, Micael Sousa Farinha and Miguel Frade
 *
 *   This file is part of aCCinaPDF.
 *
 *   aCCinaPDF is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero Affero General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   aCCinaPDF is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with aCCinaPDF.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package model;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Toshiba
 */
public class TreeNodeWithState extends DefaultMutableTreeNode {

    private final State state;

    public enum State {

        CERTIFIED,
        VALID,
        VALID_WARNING,
        CERTIFIED_WARNING,
        WARNING,
        INVALID,
        NOT_SIGNED,
        EXCLAMATION_MARK
    };

    public TreeNodeWithState(State state) {
        super();
        this.state = state;
    }

    public TreeNodeWithState(Object userObject, State state) {
        super(userObject);
        this.state = state;
    }

    public TreeNodeWithState(Object userObject, boolean allowsChildren, State state) {
        super(userObject, allowsChildren);
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
