/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PAttributeOrAssociationExpressionBody extends XPAttributeOrAssociationExpressionBody
{
    private PAttributeOrAssociationExpressionBody _pAttributeOrAssociationExpressionBody_;

    public X2PAttributeOrAssociationExpressionBody()
    {
    }

    public X2PAttributeOrAssociationExpressionBody(
        PAttributeOrAssociationExpressionBody _pAttributeOrAssociationExpressionBody_)
    {
        setPAttributeOrAssociationExpressionBody(_pAttributeOrAssociationExpressionBody_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PAttributeOrAssociationExpressionBody getPAttributeOrAssociationExpressionBody()
    {
        return _pAttributeOrAssociationExpressionBody_;
    }

    public void setPAttributeOrAssociationExpressionBody(PAttributeOrAssociationExpressionBody node)
    {
        if(_pAttributeOrAssociationExpressionBody_ != null)
        {
            _pAttributeOrAssociationExpressionBody_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pAttributeOrAssociationExpressionBody_ = node;
    }

    void removeChild(Node child)
    {
        if(_pAttributeOrAssociationExpressionBody_ == child)
        {
            _pAttributeOrAssociationExpressionBody_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pAttributeOrAssociationExpressionBody_);
    }
}