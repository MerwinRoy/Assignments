Assignment - 11

In this Assignment, An Inventory Application is created using Angular 2 framework that comprises of multiple composable components that render each other.

Product Model helps in creating a new product using a constructor that takes in 5 arguments(sku,name,imageUrl,department,price).

Inputs(passing data into child components) and outputs(passing data out of components) have been used to send data in and out of components.

Inventory Application is the top level component.

ProductListComponent renders product rows - displays list of product row components.

ProductRowComponent displays each product which can be further decomposed into 3 smaller components: ProductImageComponent(image), ProductDepartmentComponent(for department "breadcrumbs"), and PriceDisplayComponent(to display product price).

Modal component displays bootstrap modal view of each product: Upon clicking the image of product, image of the product is displayed in a Bootstrap Modal which consists of "X" button which closes the modal when clicked.
