## Error Handling Strategy
- **Component:** Exception Subprocess
- **Variable Capture:** Created an Exchange Property `ErrorMessage` using the Camel Expression `${exception.message}`.
- **Final State:** Used an `Error End` event to ensure the Message Monitoring dashboard flags the transaction as 'Failed' for easier troubleshooting.