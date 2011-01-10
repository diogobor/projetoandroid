/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AContextDeclaration extends PDeclaration
{
    private final LinkedList _contextDeclaration_ = new TypedLinkedList(new ContextDeclaration_Cast());

    public AContextDeclaration()
    {
    }

    public AContextDeclaration(
        List _contextDeclaration_)
    {
        {
            this._contextDeclaration_.clear();
            this._contextDeclaration_.addAll(_contextDeclaration_);
        }

    }

    public AContextDeclaration(
        XPContextDeclaration _contextDeclaration_)
    {
        if(_contextDeclaration_ != null)
        {
            while(_contextDeclaration_ instanceof X1PContextDeclaration)
            {
                this._contextDeclaration_.addFirst(((X1PContextDeclaration) _contextDeclaration_).getPContextDeclaration());
                _contextDeclaration_ = ((X1PContextDeclaration) _contextDeclaration_).getXPContextDeclaration();
            }
            this._contextDeclaration_.addFirst(((X2PContextDeclaration) _contextDeclaration_).getPContextDeclaration());
        }

    }
    public Object clone()
    {
        return new AContextDeclaration(
            cloneList(_contextDeclaration_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAContextDeclaration(this);
    }

    public LinkedList getContextDeclaration()
    {
        return _contextDeclaration_;
    }

    public void setContextDeclaration(List list)
    {
        _contextDeclaration_.clear();
        _contextDeclaration_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_contextDeclaration_);
    }

    void removeChild(Node child)
    {
        if(_contextDeclaration_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _contextDeclaration_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class ContextDeclaration_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PContextDeclaration node = (PContextDeclaration) o;

            if((node.parent() != null) &&
                (node.parent() != AContextDeclaration.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AContextDeclaration.this))
            {
                node.parent(AContextDeclaration.this);
            }

            return node;
        }
    }
}