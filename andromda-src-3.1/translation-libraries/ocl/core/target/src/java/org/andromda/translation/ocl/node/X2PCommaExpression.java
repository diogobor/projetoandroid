/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PCommaExpression extends XPCommaExpression
{
    private PCommaExpression _pCommaExpression_;

    public X2PCommaExpression()
    {
    }

    public X2PCommaExpression(
        PCommaExpression _pCommaExpression_)
    {
        setPCommaExpression(_pCommaExpression_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PCommaExpression getPCommaExpression()
    {
        return _pCommaExpression_;
    }

    public void setPCommaExpression(PCommaExpression node)
    {
        if(_pCommaExpression_ != null)
        {
            _pCommaExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pCommaExpression_ = node;
    }

    void removeChild(Node child)
    {
        if(_pCommaExpression_ == child)
        {
            _pCommaExpression_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pCommaExpression_);
    }
}
