/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X1PMessageArgumentsTail extends XPMessageArgumentsTail
{
    private XPMessageArgumentsTail _xPMessageArgumentsTail_;
    private PMessageArgumentsTail _pMessageArgumentsTail_;

    public X1PMessageArgumentsTail()
    {
    }

    public X1PMessageArgumentsTail(
        XPMessageArgumentsTail _xPMessageArgumentsTail_,
        PMessageArgumentsTail _pMessageArgumentsTail_)
    {
        setXPMessageArgumentsTail(_xPMessageArgumentsTail_);
        setPMessageArgumentsTail(_pMessageArgumentsTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPMessageArgumentsTail getXPMessageArgumentsTail()
    {
        return _xPMessageArgumentsTail_;
    }

    public void setXPMessageArgumentsTail(XPMessageArgumentsTail node)
    {
        if(_xPMessageArgumentsTail_ != null)
        {
            _xPMessageArgumentsTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPMessageArgumentsTail_ = node;
    }

    public PMessageArgumentsTail getPMessageArgumentsTail()
    {
        return _pMessageArgumentsTail_;
    }

    public void setPMessageArgumentsTail(PMessageArgumentsTail node)
    {
        if(_pMessageArgumentsTail_ != null)
        {
            _pMessageArgumentsTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMessageArgumentsTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPMessageArgumentsTail_ == child)
        {
            _xPMessageArgumentsTail_ = null;
        }

        if(_pMessageArgumentsTail_ == child)
        {
            _pMessageArgumentsTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPMessageArgumentsTail_) +
            toString(_pMessageArgumentsTail_);
    }
}
