package com.proofpoint.event.client;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;

public class InMemoryEventModule implements Module
{
    @Override
    public void configure(Binder binder)
    {
        binder.bind(EventClient.class).to(InMemoryEventClient.class).in(Scopes.SINGLETON);
    }
}
