<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/westdespair/bike_rental_service">
    <img src="https://github.com/Westdespair/bike_rental_service/blob/main/backend/src/main/resources/static/pictures/keeprollingrollingrolling_logo_200x200.jpg" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Bike Rental Service</h3>

  <p align="center">
    A website for a fictional bike rental service, Keep Rolling Rolling Rolling. Made as a project in our web application and web technology courses. bike_rental_service is a CRUD web application with user sessions and permissions. The site is hosted online, but you can only access it through NTNU networks or a VPN.
    <br />
    <a href="https://gr08.web-tek.ninja/"><strong>Check it out here!»</strong></a>
    <br />
    <br />
    <a href="https://github.com/westdespair/bike_rental_service">View Demo</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#functionality">Functionality</a></li>
    <li><a href="#so-can-i-contribute">So, can I contribute?</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project
![image](https://user-images.githubusercontent.com/64530905/172671727-b4c98fd3-061c-459c-9461-0eb1b84a1f70.png)
Keep Rolling Rolling Rolling is a website for a fictional bike rental service. It was made as a project in our web application and web technology courses. bike_rental_service is a CRUD web application with user sessions and permissions. You can find the site hosted online on:  https://gr08.web-tek.ninja/ (Only accessible through NTNU networks)

The website features a frontend made in JS, Thymeleafs, CSS, and HTML. The backend consists of an SQLite database, and a Springboot application. 

### Built With
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Sqlite](https://www.sqlite.org/index.html)
* [Thymeleaf](https://www.thymeleaf.org/)





<!-- GETTING STARTED -->
## Getting Started

### Prerequisites
What you need to run our project:
* A modern web browser (Google Chrome, Mozilla Firefox)
* A development environment capable of running Java files (IntelliJ, Netbeans)

### Installation

1. Clone the repository
   ```sh
   git clone https://github.com/westdespair/bike_rental_service.git
   ```
2. Open repository in your IDE of choice. We used Intellij for the Spring backend and Webstorm for the frontend.

3. Just looking at the frontend? Just open index.html in your browser of choice. You can find index.html here: `https://github.com/Westdespair/bike_rental_service/tree/main/backend/src/main/resources/templates/index.html`
4. To also access the backend, run "BikerentalApplication" from `https://github.com/Westdespair/bike_rental_service/blob/main/backend/src/main/java/no/ntnu/bikerental/BikerentalApplication.java`
5. Open to view the website, open in browser: `localhost:/8080`





<!-- FUNCTIONALITY -->
## Functionality
![image](https://user-images.githubusercontent.com/64530905/172671888-a5428d46-b150-4605-880c-6bbbdbc57323.png)
![image](https://user-images.githubusercontent.com/64530905/172672108-4575c6c0-6e2c-4347-a5a5-f87a6846bdba.png)

Intuitive menu allows user to select the bike they want, or prompt them to select something else should the bike be unavailable.
 ### Different roles with different permissions:
 #### Guest: 
  * Non logged-in user
  * Can only access surface information, can't rent bike yet
  * Call to action leads to user account creation
 #### User: 
  * Logged in user
  * Order one bike at the time and perform transactions
  * Post comments
  * edit own comments
  * delete own comments

 #### Admin:
  * All rights of user
  * Delete other user comments
  * Disable users
  * Set users as admin
  * Add or remove products
  * Add or remove bikes

## Design Guidelines:
* Rounded edges, images, buttons
* Rounded sans-serif fonts. Roboto? Ubuntu?
* Vibrant, healthy colours
* Shadows under selected elements
* Never too many images of hip people on bikes

<!-- SO CAN I CONTRIBUTE -->
## So, can I contribute?
### Not at this time. 
As this is intended as a school project, we will not be accepting contributions from the community. The repository is kept public to let professors examine our project without requesting read access. Feel free to make a fork if you want to though!




<!-- LICENSE -->
## License

Distributed under the [GPL License](https://www.gnu.org/licenses/gpl-3.0.txt). You are allowed to copy and modify the contents, but it must be done non-commercially. 



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
Some convenient stuff we've taken advantage of:
* [Readme template by Othneil Drew](https://github.com/othneildrew/Best-README-Template#getting-started)
* [Free stock photos from Pexels](https://www.pexels.com/)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/westdespair/bike_rental_service.svg?style=for-the-badge
[contributors-url]: https://github.com/westdespair/bike_rental_service/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/westdespair/bike_rental_service.svg?style=for-the-badge
[forks-url]: https://github.com/westdespair/bike_rental_service/network/members
[stars-shield]: https://img.shields.io/github/stars/westdespair/bike_rental_service.svg?style=for-the-badge
[stars-url]: https://github.com/westdespair/bike_rental_service/stargazers
[issues-shield]: https://img.shields.io/github/issues/westdespair/bike_rental_service.svg?style=for-the-badge
[issues-url]: https://github.com/westdespair/bike_rental_service/issues
[license-shield]: https://img.shields.io/github/license/westdespair/bike_rental_service.svg?style=for-the-badge
[license-url]: https://github.com/westdespair/bike_rental_service/blob/master/LICENSE.txt
[product-screenshot]: images/screenshot.png
