/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.andromda.translation.ocl.node;

import java.util.*;
import org.andromda.translation.ocl.analysis.*;

public final class AIterateFeatureCallParameterOption extends PFeatureCallParameterOption
{
    private TSemicolon _semicolon_;
    private TName _name_;
    private PTypeDeclaration _typeDeclaration_;
    private TEqual _equal_;
    private PExpression _expression_;

    public AIterateFeatureCallParameterOption()
    {
    }

    public AIterateFeatureCallParameterOption(
        TSemicolon _semicolon_,
        TName _name_,
        PTypeDeclaration _typeDeclaration_,
        TEqual _equal_,
        PExpression _expression_)
    {
        setSemicolon(_semicolon_);

        setName(_name_);

        setTypeDeclaration(_typeDeclaration_);

        setEqual(_equal_);

        setExpression(_expression_);

    }
    public Object clone()
    {
        return new AIterateFeatureCallParameterOption(
            (TSemicolon) cloneNode(_semicolon_),
            (TName) cloneNode(_name_),
            (PTypeDeclaration) cloneNode(_typeDeclaration_),
            (TEqual) cloneNode(_equal_),
            (PExpression) cloneNode(_expression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIterateFeatureCallParameterOption(this);
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
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

    public PTypeDeclaration getTypeDeclaration()
    {
        return _typeDeclaration_;
    }

    public void setTypeDeclaration(PTypeDeclaration node)
    {
        if(_typeDeclaration_ != null)
        {
            _typeDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _typeDeclaration_ = node;
    }

    public TEqual getEqual()
    {
        return _equal_;
    }

    public void setEqual(TEqual node)
    {
        if(_equal_ != null)
        {
            _equal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _equal_ = node;
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_semicolon_)
            + toString(_name_)
            + toString(_typeDeclaration_)
            + toString(_equal_)
            + toString(_expression_);
    }

    void removeChild(Node child)
    {
        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

        if(_name_ == child)
        {
            _name_ = null;
            return;
        }

        if(_typeDeclaration_ == child)
        {
            _typeDeclaration_ = null;
            return;
        }

        if(_equal_ == child)
        {
            _equal_ = null;
            return;
        }

        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        if(_name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(_typeDeclaration_ == oldChild)
        {
            setTypeDeclaration((PTypeDeclaration) newChild);
            return;
        }

        if(_equal_ == oldChild)
        {
            setEqual((TEqual) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

    }
}
