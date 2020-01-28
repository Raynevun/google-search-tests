package org.abryg.webwidgets;

import org.abryg.AbstractWebPageSegment;

public abstract class AbstractWebPageWidget extends AbstractWebPageSegment implements IWebPageWidget {

    public AbstractWebPageWidget() {
        super();
    }

    @Override
    public abstract void initializeWidget();

}
