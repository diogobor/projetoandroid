/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ATypeDeclaration extends PTypeDeclaration
{
    private TColon _colon_;
    private PType _type_;

    public ATypeDeclaration()
    {
    }

    public ATypeDeclaration(
        TColon _colon_,
        PType _type_)
    {
        setColon(_colon_);

        setType(_type_);

    }
    public Object clone()
    {
        return new ATypeDeclaration(
            (TColon) cloneNode(_colon_),
            (PType) cloneNode(_type_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypeDeclaration(this);
    }

    public TColon getColon()
    {
        return _colon_;
    }

    public void setColon(TColon node)
    {
        if(_colon_ != null)
        {
            _colon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _colon_ = node;
    }

    public PType getType()
    {
        return _type_;
    }

    public void setType(PType node)
    {
        if(_type_ != null)
        {
            _type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _type_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_colon_)
            + toString(_type_);
    }

    void removeChild(Node child)
    {
        if(_colon_ == child)
        {
            _colon_ = null;
            return;
        }

        if(_type_ == child)
        {
            _type_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(_type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

    }
}
