/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PPathNameTail extends XPPathNameTail
{
    private PPathNameTail _pPathNameTail_;

    public X2PPathNameTail()
    {
    }

    public X2PPathNameTail(
        PPathNameTail _pPathNameTail_)
    {
        setPPathNameTail(_pPathNameTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PPathNameTail getPPathNameTail()
    {
        return _pPathNameTail_;
    }

    public void setPPathNameTail(PPathNameTail node)
    {
        if(_pPathNameTail_ != null)
        {
            _pPathNameTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pPathNameTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pPathNameTail_ == child)
        {
            _pPathNameTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pPathNameTail_);
    }
}