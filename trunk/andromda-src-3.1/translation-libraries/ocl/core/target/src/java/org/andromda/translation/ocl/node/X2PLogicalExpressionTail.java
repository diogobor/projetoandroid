/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PLogicalExpressionTail extends XPLogicalExpressionTail
{
    private PLogicalExpressionTail _pLogicalExpressionTail_;

    public X2PLogicalExpressionTail()
    {
    }

    public X2PLogicalExpressionTail(
        PLogicalExpressionTail _pLogicalExpressionTail_)
    {
        setPLogicalExpressionTail(_pLogicalExpressionTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PLogicalExpressionTail getPLogicalExpressionTail()
    {
        return _pLogicalExpressionTail_;
    }

    public void setPLogicalExpressionTail(PLogicalExpressionTail node)
    {
        if(_pLogicalExpressionTail_ != null)
        {
            _pLogicalExpressionTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pLogicalExpressionTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pLogicalExpressionTail_ == child)
        {
            _pLogicalExpressionTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pLogicalExpressionTail_);
    }
}
