package cn.mark.springframework.context.event;

import cn.mark.springframework.context.ApplicationContext;
import cn.mark.springframework.context.ApplicationEvent;

public class ApplicationContextEvent extends ApplicationEvent {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }
}
