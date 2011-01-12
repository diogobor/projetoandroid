/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class ADefClassifierExpressionBody extends PClassifierExpressionBody
{
    private TDef _def_;
    private TName _name_;
    private TColon _colon_;
    private PDefinitionExpression _definitionExpression_;

    public ADefClassifierExpressionBody()
    {
    }

    public ADefClassifierExpressionBody(
        TDef _def_,
        TName _name_,
        TColon _colon_,
        PDefinitionExpression _definitionExpression_)
    {
        setDef(_def_);

        setName(_name_);

        setColon(_colon_);

        setDefinitionExpression(_definitionExpression_);

    }
    public Object clone()
    {
        return new ADefClassifierExpressionBody(
            (TDef) cloneNode(_def_),
            (TName) cloneNode(_name_),
            (TColon) cloneNode(_colon_),
            (PDefinitionExpression) cloneNode(_definitionExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADefClassifierExpressionBody(this);
    }

    public TDef getDef()
    {
        return _def_;
    }

    public void setDef(TDef node)
    {
        if(_def_ != null)
        {
            _def_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _def_ = node;
    }

    public TName getName()
    {
        return _name_;
    }

    public void setName(TName node)
    {
        if(_name_ != null)
        {
            _name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _name_ = node;
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

    public PDefinitionExpression getDefinitionExpression()
    {
        return _definitionExpression_;
    }

    public void setDefinitionExpression(PDefinitionExpression node)
    {
        if(_definitionExpression_ != null)
        {
            _definitionExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _definitionExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_def_)
            + toString(_name_)
            + toString(_colon_)
            + toString(_definitionExpression_);
    }

    void removeChild(Node child)
    {
        if(_def_ == child)
        {
            _def_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_colon_ == child)
        {
            _colon_ = null;
            return;
        }

        if(_definitionExpression_ == child)
        {
            _definitionExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_def_ == oldChild)
        {
            setDef((TDef) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(_colon_ == oldChild)
        {
            setColon((TColon) newChild);
            return;
        }

        if(_definitionExpression_ == oldChild)
        {
            setDefinitionExpression((PDefinitionExpression) newChild);
            return;
        }

    }
}