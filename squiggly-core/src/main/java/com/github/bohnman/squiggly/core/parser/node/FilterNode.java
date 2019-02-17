package com.github.bohnman.squiggly.core.parser.node;

import com.github.bohnman.squiggly.core.parser.ParseContext;

import java.util.Collections;
import java.util.List;

public class FilterNode extends BaseSquigglyNode {

    public static final FilterNode EMPTY = new FilterNode(ParseContext.EMPTY, Collections.emptyList());

    private final List<StatementNode> statements;

    public FilterNode(ParseContext context, List<StatementNode> statements) {
        super(context, SquigglyNodeType.FILTER);
        this.statements = statements;
    }

    public List<StatementNode> getStatements() {
        return statements;
    }
}
