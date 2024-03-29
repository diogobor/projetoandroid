/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ABodyOperationStereotype extends POperationStereotype
{
    private TBody _body_;

    public ABodyOperationStereotype()
    {
    }

    public ABodyOperationStereotype(
        TBody _body_)
    {
        setBody(_body_);

    }
    public Object clone()
    {
        return new ABodyOperationStereotype(
            (TBody) cloneNode(_body_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABodyOperationStereotype(this);
    }

    public TBody getBody()
    {
        return _body_;
    }

    public void setBody(TBody node)
    {
        if(_body_ != null)
        {
            _body_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _body_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_body_);
    }

    void removeChild(Node child)
    {
        if(_body_ == child)
        {
            _body_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_body_ == oldChild)
        {
            setBody((TBody) newChild);
            return;
        }

    }
}
