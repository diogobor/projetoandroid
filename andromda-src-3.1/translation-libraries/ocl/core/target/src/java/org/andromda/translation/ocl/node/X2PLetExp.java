/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PLetExp extends XPLetExp
{
    private PLetExp _pLetExp_;

    public X2PLetExp()
    {
    }

    public X2PLetExp(
        PLetExp _pLetExp_)
    {
        setPLetExp(_pLetExp_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PLetExp getPLetExp()
    {
        return _pLetExp_;
    }

    public void setPLetExp(PLetExp node)
    {
        if(_pLetExp_ != null)
        {
            _pLetExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pLetExp_ = node;
    }

    void removeChild(Node child)
    {
        if(_pLetExp_ == child)
        {
            _pLetExp_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pLetExp_);
    }
}
