# Homework-5-Solution Proxy and Flyweight Design Patterns
## Proxy Pattern – Image Management System
Problem:
On a real estate website, agents upload high-resolution images of properties, which can slow down the site due to large file sizes. The system needs to display low-resolution thumbnails by default and load the full-resolution images only when necessary.

Solution:
By applying the Proxy Pattern, a proxy object initially displays low-res thumbnails and loads the high-res images only on demand. A protection proxy is also used to ensure that only authenticated agents can upload or replace images.

Benefit:
The Proxy Pattern boosts performance by deferring the loading of large images and enhances security by restricting upload access to authorized users.


## Flyweight Pattern – Map Markers
Problem:
Rendering thousands of map markers for locations such as restaurants or gas stations can lead to high memory consumption, as style data (like icons and colors) is duplicated for each marker.

Solution:
The Flyweight Pattern is applied to share common style elements—such as icons and colors—across multiple markers. This minimizes memory usage while still allowing each marker to maintain its unique position.

Benefit:
By reusing shared styles, the Flyweight Pattern significantly reduces memory overhead, improving the application's efficiency when handling large volumes of data.

## In both scenarios, the Proxy and Flyweight Patterns contributed to a more streamlined design, enhanced performance, and reduced resource usage. These design patterns are valuable techniques for optimizing complex systems, as they allow for more efficient object creation and access management.
