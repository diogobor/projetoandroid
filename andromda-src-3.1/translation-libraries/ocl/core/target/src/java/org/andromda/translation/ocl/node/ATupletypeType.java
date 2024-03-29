/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ATupletypeType extends PType
{
    private PTupleType _tupleType_;

    public ATupletypeType()
    {
    }

    public ATupletypeType(
        PTupleType _tupleType_)
    {
        setTupleType(_tupleType_);

    }
    public Object clone()
    {
        return new ATupletypeType(
            (PTupleType) cloneNode(_tupleType_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATupletypeType(this);
    }

    public PTupleType getTupleType()
    {
        return _tupleType_;
    }

    public void setTupleType(PTupleType node)
    {
        if(_tupleType_ != null)
        {
            _tupleType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _tupleType_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_tupleType_);
    }

    void removeChild(Node child)
    {
        if(_tupleType_ == child)
        {
            _tupleType_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_tupleType_ == oldChild)
        {
            setTupleType((PTupleType) newChild);
            return;
        }

    }
}
