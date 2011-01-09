/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AVariableDeclarationList extends PVariableDeclarationList
{
    private PVariableDeclaration _variableDeclaration_;
    private PEqualExpression _variableDeclarationValue_;
    private final LinkedList _variableDeclarationListTail_ = new TypedLinkedList(new VariableDeclarationListTail_Cast());

    public AVariableDeclarationList()
    {
    }

    public AVariableDeclarationList(
        PVariableDeclaration _variableDeclaration_,
        PEqualExpression _variableDeclarationValue_,
        List _variableDeclarationListTail_)
    {
        setVariableDeclaration(_variableDeclaration_);

        setVariableDeclarationValue(_variableDeclarationValue_);

        {
            this._variableDeclarationListTail_.clear();
            this._variableDeclarationListTail_.addAll(_variableDeclarationListTail_);
        }

    }

    public AVariableDeclarationList(
        PVariableDeclaration _variableDeclaration_,
        PEqualExpression _variableDeclarationValue_,
        XPVariableDeclarationListTail _variableDeclarationListTail_)
    {
        setVariableDeclaration(_variableDeclaration_);

        setVariableDeclarationValue(_variableDeclarationValue_);

        if(_variableDeclarationListTail_ != null)
        {
            while(_variableDeclarationListTail_ instanceof X1PVariableDeclarationListTail)
            {
                this._variableDeclarationListTail_.addFirst(((X1PVariableDeclarationListTail) _variableDeclarationListTail_).getPVariableDeclarationListTail());
                _variableDeclarationListTail_ = ((X1PVariableDeclarationListTail) _variableDeclarationListTail_).getXPVariableDeclarationListTail();
            }
            this._variableDeclarationListTail_.addFirst(((X2PVariableDeclarationListTail) _variableDeclarationListTail_).getPVariableDeclarationListTail());
        }

    }
    public Object clone()
    {
        return new AVariableDeclarationList(
            (PVariableDeclaration) cloneNode(_variableDeclaration_),
            (PEqualExpression) cloneNode(_variableDeclarationValue_),
            cloneList(_variableDeclarationListTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVariableDeclarationList(this);
    }

    public PVariableDeclaration getVariableDeclaration()
    {
        return _variableDeclaration_;
    }

    public void setVariableDeclaration(PVariableDeclaration node)
    {
        if(_variableDeclaration_ != null)
        {
            _variableDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _variableDeclaration_ = node;
    }

    public PEqualExpression getVariableDeclarationValue()
    {
        return _variableDeclarationValue_;
    }

    public void setVariableDeclarationValue(PEqualExpression node)
    {
        if(_variableDeclarationValue_ != null)
        {
            _variableDeclarationValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _variableDeclarationValue_ = node;
    }

    public LinkedList getVariableDeclarationListTail()
    {
        return _variableDeclarationListTail_;
    }

    public void setVariableDeclarationListTail(List list)
    {
        _variableDeclarationListTail_.clear();
        _variableDeclarationListTail_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_variableDeclaration_)
            + toString(_variableDeclarationValue_)
            + toString(_variableDeclarationListTail_);
    }

    void removeChild(Node child)
    {
        if(_variableDeclaration_ == child)
        {
            _variableDeclaration_ = null;
            return;
        }

        if(_variableDeclarationValue_ == child)
        {
            _variableDeclarationValue_ = null;
            return;
        }

        if(_variableDeclarationListTail_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_variableDeclaration_ == oldChild)
        {
            setVariableDeclaration((PVariableDeclaration) newChild);
            return;
        }

        if(_variableDeclarationValue_ == oldChild)
        {
            setVariableDeclarationValue((PEqualExpression) newChild);
            return;
        }

        for(ListIterator i = _variableDeclarationListTail_.listIterator(); i.hasNext();)
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

    private class VariableDeclarationListTail_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PVariableDeclarationListTail node = (PVariableDeclarationListTail) o;

            if((node.parent() != null) &&
                (node.parent() != AVariableDeclarationList.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AVariableDeclarationList.this))
            {
                node.parent(AVariableDeclarationList.this);
            }

            return node;
        }
    }
}
