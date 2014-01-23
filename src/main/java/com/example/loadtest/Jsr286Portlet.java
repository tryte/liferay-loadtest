package com.example.loadtest;

import java.io.IOException;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class Jsr286Portlet extends GenericPortlet {
    @Override
    protected void doView(final RenderRequest request, final RenderResponse response) throws PortletException,
            IOException {
        response.getWriter().write("<p>Hello, World!</p>");
    }
}
