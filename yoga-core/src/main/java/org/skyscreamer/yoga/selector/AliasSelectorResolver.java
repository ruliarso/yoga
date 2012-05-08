package org.skyscreamer.yoga.selector;

import org.skyscreamer.yoga.exceptions.ParseSelectorException;

/**
 * Created by IntelliJ IDEA. User: corby
 */
public interface AliasSelectorResolver
{
    String resolveSelector( String aliasSelectorExpression ) throws ParseSelectorException;
}
