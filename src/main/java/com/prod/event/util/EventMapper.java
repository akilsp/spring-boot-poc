package com.prod.event.util;

        import com.prod.event.dto.EventDTO;
        import com.prod.event.entity.Event;
        import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDTO eventToEventDTO(Event event);
    Event eventDTOToEvent(EventDTO eventDTO);
}
