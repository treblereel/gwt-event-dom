/*
 * Copyright © 2019 The GWT Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gwtproject.event.dom.client;

import org.gwtproject.dom.client.BrowserEvents;

/** Represents a native mouse down event. */
public class MouseDownEvent extends MouseEvent<MouseDownHandler> {

  /** Event type for mouse down events. Represents the meta-data associated with this event. */
  private static final Type<MouseDownHandler> TYPE =
      new Type<>(BrowserEvents.MOUSEDOWN, new MouseDownEvent());

  /**
   * Protected constructor, use {@link
   * DomEvent#fireNativeEvent(org.gwtproject.dom.client.NativeEvent,
   * org.gwtproject.event.shared.HasHandlers)} to fire mouse down events.
   */
  protected MouseDownEvent() {}

  /**
   * Gets the event type associated with mouse down events.
   *
   * @return the handler type
   */
  public static Type<MouseDownHandler> getType() {
    return TYPE;
  }

  @Override
  public final Type<MouseDownHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(MouseDownHandler handler) {
    handler.onMouseDown(this);
  }
}
