/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import org.andromda.translation.ocl.analysis.*;

public final class X2PVariableDeclarationListTail extends XPVariableDeclarationListTail
{
    private PVariableDeclarationListTail _pVariableDeclarationListTail_;

    public X2PVariableDeclarationListTail()
    {
    }

    public X2PVariableDeclarationListTail(
        PVariableDeclarationListTail _pVariableDeclarationListTail_)
    {
        setPVariableDeclarationListTail(_pVariableDeclarationListTail_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public PVariableDeclarationListTail getPVariableDeclarationListTail()
    {
        return _pVariableDeclarationListTail_;
    }

    public void setPVariableDeclarationListTail(PVariableDeclarationListTail node)
    {
        if(_pVariableDeclarationListTail_ != null)
        {
            _pVariableDeclarationListTail_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pVariableDeclarationListTail_ = node;
    }

    void removeChild(Node child)
    {
        if(_pVariableDeclarationListTail_ == child)
        {
            _pVariableDeclarationListTail_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_pVariableDeclarationListTail_);
    }
}
