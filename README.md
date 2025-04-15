<h1>🛒 Product Manager</h1>
<p>Product Manager is a Java application developed for basic inventory management, allowing users to register, list, remove, and update the quantity of products in a market system. Products can be either perishable or non-perishable, and each one belongs to a category and has an associated supplier.</p>

<h2>⚙️ How It Was Made</h2>
<p>This project was developed in <strong>Java</strong>, using only the standard library. The application runs in the command line interface (CLI) and follows the object-oriented programming paradigm.</p>

<h2>🔧 Features</h2>
<ul>
  <li>📦 Register products (perishable or not)</li>
  <li>🗑️ Remove products</li>
  <li>➕ Add quantity to existing products</li>
  <li>📋 List all registered products (sorted by name)</li>
</ul>

<h2>📂 Project Structure</h2>
<ul>
  <li><strong>Main</strong> - Entry point of the application</li>
  <li><strong>Product</strong> - Abstract class representing a generic product</li>
  <li><strong>ProductPerecivel</strong> - Concrete class for perishable products</li>
  <li><strong>ProductNaoPerecivel</strong> - Concrete class for non-perishable products</li>
  <li><strong>Category</strong> - Represents the category of products</li>
  <li><strong>Supplier</strong> - Represents the supplier associated with products</li>
  <li><strong>ProductManager</strong> - Manages product registration, removal, and updates</li>
  <li><strong>ProductNotFoundException</strong> - Custom exception for handling missing products</li>
</ul>
