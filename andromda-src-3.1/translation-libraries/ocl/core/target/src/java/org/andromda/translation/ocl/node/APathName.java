/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class APathName extends PPathName
{
    private TName _name_;
    private final LinkedList _pathNameTail_ = new TypedLinkedList(new PathNameTail_Cast());

    public APathName()
    {
    }

    public APathName(
        TName _name_,
        List _pathNameTail_)
    {
        setName(_name_);

        {
            this._pathNameTail_.clear();
            this._pathNameTail_.addAll(_pathNameTail_);
        }

    }

    public APathName(
        TName _name_,
        XPPathNameTail _pathNameTail_)
    {
        setName(_name_);

        if(_pathNameTail_ != null)
        {
            while(_pathNameTail_ instanceof X1PPathNameTail)
            {
                this._pathNameTail_.addFirst(((X1PPathNameTail) _pathNameTail_).getPPathNameTail());
                _pathNameTail_ = ((X1PPathNameTail) _pathNameTail_).getXPPathNameTail();
            }
            this._pathNameTail_.addFirst(((X2PPathNameTail) _pathNameTail_).getPPathNameTail());
        }

    }
    public Object clone()
    {
        return new APathName(
            (TName) cloneNode(_name_),
            cloneList(_pathNameTail_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAPathName(this);
    }

    public TName getName()
    {
        return _name_;
    }

    public void setName(TName node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
    }

    public LinkedList getPathNameTail()
    {
        return _pathNameTail_;
    }

    public void setPathNameTail(List list)
    {
        _pathNameTail_.clear();
        _pathNameTail_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_name_)
            + toString(_pathNameTail_);
    }

    void removeChild(Node child)
    {
        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_pathNameTail_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        for(ListIterator i = _pathNameTail_.listIterator(); i.hasNext();)
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

    private class PathNameTail_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PPathNameTail node = (PPathNameTail) o;

            if((node.parent() != null) &&
                (node.parent() != APathName.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != APathName.this))
            {
                node.parent(APathName.this);
            }

            return node;
        }
    }
}
