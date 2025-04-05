README
Project Overview
This project demonstrates the use of Proxy and Flyweight design patterns to improve performance and memory usage in real-world applications. The Proxy pattern is applied to manage property images in a real estate system, and the Flyweight pattern is used to optimize handling large numbers of map markers.

1. Proxy Pattern
Real-Life Scenario
In a real estate agency’s image management system, agents upload high-resolution images. The website should only load these high-res images when needed (e.g., when zooming in), to save memory and improve loading times.

Explanation
The Proxy Pattern allows us to load low-res thumbnails immediately and load high-res images only when the user clicks to zoom. This reduces initial load time and saves memory by loading full images only when necessary.

A Protection Proxy ensures that only logged-in agents can upload or replace images.

2. Flyweight Pattern
Real-Life Scenario
In a map application with thousands of markers (for gas stations, restaurants, hospitals), the markers often share the same style. Without optimization, each marker would create a new instance of its style, leading to unnecessary memory usage.

Explanation
The Flyweight Pattern optimizes this by storing common data (like marker styles) in a shared place (a map). Instead of creating duplicate style instances for every marker, the styles are reused, saving memory and improving performance.

Conclusion
Proxy Pattern reduces bandwidth and loading times by only displaying high-resolution images when needed.

Flyweight Pattern reduces memory usage by sharing common data (marker styles) across many objects.
