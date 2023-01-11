# Document management system

Document management system is a system that can register, store, and inquire various documents.

## Installation

Use the Github fork/clone or install as zip

```bash
git clone https://github.com/Tublanx/document-management-system
```

## Usage

```java
// Save at mysql with image, document's name, etc.
documentService.save('idcard');

// Move document to another box
documentService.transfer('idcard');

// Discard document
documentService.discardDoc('idcard');

// Discard box
documentService.discardBox('idcard');
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.
